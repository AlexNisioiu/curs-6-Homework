public class Bottle {
    int totalCapacity;
    double availabelLiquid;
    boolean open;

    public Bottle(int totalCapacity) {
        this.totalCapacity = totalCapacity;
        this.availabelLiquid = totalCapacity * 0.75;

    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public double getAvailabelLiquid() {
        return availabelLiquid;
    }

    public String isOpen() {
        return open();
    }

    public boolean hasLiquid() {
        if(availabelLiquid > 0){
            return true;
        }else {
            return false;
        }
    }


    public double emptyCapacity() {
        double result = totalCapacity -= availabelLiquid;
        return result;
    }

    public String open() {
        if (open) {
            return "Already opened";
        } else {
            this.open = true;
            return "Baottle is opened";
        }
    }

    public String drink(double amount) {
        if (!open) {
            return "Bottle is not opened";
        }
        if (amount > this.availabelLiquid) {
            return "Not enough liquid";
        }else if(this.availabelLiquid > amount){
            return "Bottle has more liquid " + (this.availabelLiquid - amount);
        }
        return "Remaining " + this.availabelLiquid;
    }
    public String afterDrink(){
        return "Bottle is closed";
    }

}