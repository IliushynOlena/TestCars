public class Car {
    private int id;
    private String firm;
    private String model;
    private int year;
    private String color;
    private double price;
    private int number;
    static int count=0;
    public Car(String firm, String model, int year, String color, double price,int Id) {
        count++;
        this.firm = firm;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.id=id;
//        this.Number=(int)Math.random()*100000;
    }
    public boolean equals(Object obj){
        Car emp = (Car) obj;
        boolean status = false;
        if(this.firm.equalsIgnoreCase(emp.firm)
                && this.model == emp.model
                && this.year == emp.year&&
                this.color == emp.color&&
                this.price == emp.price
        ){
            status = true;
        }
        return status;
    }
    public int hashCode(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setMake(String firm) {
        this.firm = firm;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int Year) {
        this.year = Year;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    public void setNumber(int Number) {
        this.number = Number;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }


    public String GetMake(){
        return this.firm;
    }
    public Car GetCarByYear(int year)
    {
        if((2020-this.year)>=year)
        {
            Print();
            return this;
        }
        return null;
    }
    public Car GetCarByYearAndPrice(int year,double price)
    {
        if(this.year==year&&this.price>=price) {
            Print();
            return this;
        }
        return null;
    }
    public void Print()
    { System.out.println();
        System.out.println("Make: "+ this.firm + "\nModel: "+this.model);
        System.out.println();
    }
}
