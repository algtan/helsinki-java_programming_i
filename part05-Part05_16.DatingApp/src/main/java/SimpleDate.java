
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        this.day = this.day + 1;
        
        // Condition if day is over 30
        if (this.day > 30) {
            this.month = this.month + 1;
            this.day = 1;
        }
        
        // Condition if month is over 12
        if (this.month > 12) {
            this.year = this.year + 1;
            this.month = 1;
        }
    }
    
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        
        // Clone the current date
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        
        // Advance the date
        newDate.advance(days);
        
        return newDate;
    }

}