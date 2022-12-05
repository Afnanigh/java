package javaapplication108;

public class employ{
private String name;
private int id;
private DATE date;

    public employ(String name, int id, DATE date) {
        this.name = name;
        this.id = id;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public DATE getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(DATE date) {
        this.date = date;
    }

   public void display(){
           System.out.println("your name"+name);
               System.out.println("you Id"+id);
               date.display();
   }
    
}

