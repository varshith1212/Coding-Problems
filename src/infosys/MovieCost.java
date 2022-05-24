package infosys;

class MovieTicket {
    //Implement your code here

    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats){
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

    public double calculateTotalAmount(){
        if(movieId == 111){
            setCostPerTicket(7);
        }else if(movieId == 112){
            setCostPerTicket(8);
        }else if(movieId == 113){
            setCostPerTicket(8.5);
        }else{
            setCostPerTicket(0);
        }

        double amountToBePaid;

        amountToBePaid = (costPerTicket*noOfSeats);
        amountToBePaid += (amountToBePaid*2)/100;

        return amountToBePaid;
    }

    public int getMovieId(){
        return movieId;
    }

    public void setMovieId(int movieId){
        this.movieId = movieId;
    }

    public int getNoOfSeats(){
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }

}



class MovieCost {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(111, 1);
        double amount = movieTicket.calculateTotalAmount();
        if (amount == 0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
    }
}
