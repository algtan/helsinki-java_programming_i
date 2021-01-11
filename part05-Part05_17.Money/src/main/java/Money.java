
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        
        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        // Condition if this' Euros is greater than compared
        if (this.euros() < compared.euros()) {
            return true;
        // Condition if this' Euros is the same as compared, but the cents are greater
        } else if (this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        int thisTotalCents = this.euros() * 100 + this.cents();
        int decreaserTotalCents = decreaser.euros() * 100 + decreaser.cents();
        
        int diff = thisTotalCents - decreaserTotalCents;
         
        if (diff < 0) {
            Money zero = new Money(0,0);
            return zero;
        } else {
            int diffEuros = 0;
            int diffCents = diff % 100;;
            if (diff > 99) {
                diffEuros = (diff - diffCents) / 100;
            }
            Money newMoney = new Money(diffEuros, diffCents);
            return newMoney;
        }
    }

}
