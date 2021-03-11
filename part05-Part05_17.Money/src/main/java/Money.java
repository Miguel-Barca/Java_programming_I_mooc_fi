
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
    Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth

    // return the new Money object
    return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros == compared.euros()) {
            return compared.cents > this.cents;
        }
        return compared.euros > this.euros;
    }
    
    public Money minus(Money decreaser) {
        int newEuros = 0;
        int newCents = 0;
        
        if(this.euros - decreaser.euros >=0) {
            newEuros = this.euros - decreaser.euros;
            
            if(this.cents - decreaser.cents <= 0) {
                newCents = 100 - Math.abs(this.cents - decreaser.cents);
                newEuros--;
            } else {
                newCents = this.cents - decreaser.cents;
            }
        } else { //if euros < 0
            newEuros = 0;
            newCents = 0;
        }
        
       
        Money newObj = new Money(newEuros, newCents);
        return newObj;
    }
}
