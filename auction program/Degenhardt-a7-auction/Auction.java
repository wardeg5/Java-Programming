import java.util.ArrayList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author Warren Degenhardt
 * @version 2015.07.30
 * x
 * -Added Close method to the auction class, iterates over the
collection of lots and print out details of all the lots. Uses a for-each loop. Any lot that has had at
least one bid for it is considered to be sold,looking for is Lot objects whose
highestBid field is not null. Uses a local variable inside the loop to store the value returned
from calls to the getHighestBid method, and then tests that variable for the null value.
 * 
 * -Added a getUnsold method to the Auction class with the following header:
public ArrayList<Lot> getUnsold()
 * 
 * Added a removeLot method
 */
public class Auction

{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }

    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public void makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("The bid for lot number " +
                    lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                    " already has a bid of: " +
                    highestBid.getValue());
            }
        }
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
        public Lot getLot(int number)
    {
        for(Lot lot : lots) {          //iterate
            if(lot.getNumber() == number) { //check equality
                return lot;
            } else if (lot.getNumber() > number) {//we know that the arraylist has changed, values don't match
                System.out.println("Lot number: " + number +
                               " does not exist.");
                return null;
            }
        } 
        return null; //if there are no lots to display, return null
    }                         

    /**
     * Remove the lot with the given lot number.
     * @param number The number of the lot to be removed
     * @return The Lot with the given number, or null if
     * there is no such lot.
     */
    public Lot removeLot(int number) {
        //find the lot 
        Lot lot = getLot(number);
        if(lot != null) {
            //remove the lot
            lots.remove(lot);
        } 
        return lot;
    }

        public void close()
        {
            for (Lot lot : lots ){

                if (!(lot == null)) {
                    Bid bid = lot.getHighestBid();
                    Person person = bid.getBidder();
                    System.out.println(person.getName());
                }
                System.out.println("No bidder!");

            }
        }

        public ArrayList<Lot> getUnsold(){
            ArrayList<Lot> unsold = new ArrayList<Lot>();
            for(Lot lot  : lots) {
                Bid bid = lot.getHighestBid();
                if(bid == null) {
                    unsold.add(lot);
                }
            }
            return unsold;

        }

    }
