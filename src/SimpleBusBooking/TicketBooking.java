package SimpleBusBooking;

import java.util.Scanner;

public class TicketBooking {
    public static Bus checkByBusID(int busId){
        for(Bus b:Bus.bus){
            if(b.busId==busId){
                return b;
            }

        }return new Bus(0,"null","null","null",0);
    }
    public static Booking confirmBook(User user,Bus foundBus){
        System.out.println("------------------------");
            System.out.println("Booking Success ");
           return new Booking(user.id,foundBus.busId,
                    user.name, foundBus.busName,
                    foundBus.from+ " -> "+foundBus.to);

    }
    public static void generateTicket(Booking b){
        System.out.println("Ticket Details ");
        System.out.println("-----------------------------");
        System.out.println("User Id : "+b.userId);
        System.out.println("Name : "+b.name);
        System.out.println("Bus Id : "+b.busId);
        System.out.println("Bus Name : "+b.busName);
        System.out.println("Journey : "+b.fromTo);
        System.out.println();
        System.out.println(" HAPPY JOURNEY ");
    }
    public static User getUserDetails(){
        System.out.print("Enter id: ");
        int id=scanner.nextInt();
        System.out.print("Enter Name: ");
        String name=scanner.next();
        System.out.print("Enter Age: ");
        int age=scanner.nextInt();
        return new User(id,name,age);
    }
    public static void searchBus(){
        System.out.print("Enter the Departure name : ");
        String f=scanner.next();
        System.out.print("Enter the Destination name : ");
        String t=scanner.next();
        boolean isFound=false;
        Bus foundBus=null;
        for(Bus b: Bus.bus){
            if(b.from.equalsIgnoreCase(f)&&b.to.equalsIgnoreCase(t)){
                System.out.println("Bus Found ....");
                System.out.println("Bus Details => "+b);
                foundBus=b;
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Sorry Bus not Fount between these routes ....");
        }
        else{
            System.out.println("Want to book that bus press 1");
            int book=scanner.nextInt();
            if(book==1){
              User user= getUserDetails();
                confirmBook(user,foundBus);
                    for(Booking b:Booking.booking){
                        if(b.busId==foundBus.busId && b.userId==user.id){
                            generateTicket(b);
                            break;
                        }
                    }
                }
                else{
                    System.out.println("Enter valid options");}
            }
        }

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        Bus b1=new Bus(10,"NNN travels","Mayiladuthurai","Tambaram",101);
        Bus b2=new Bus(11,"AAA travels","Tambaram","Mayiladuthurai",102);
        Bus b3=new Bus(12,"KPY travels","Chennai","Trichy",103);
        Bus b4=new Bus(13,"SRI travels","Trichy","Chennai",104);
        Bus b5=new Bus(14,"LA travels","Karaikal","Chennai",105);
        Bus b6=new Bus(11,"MM travels","Chennai","Karaikal",106);
        System.out.println("Available Bus");
        for(Bus b:Bus.bus){
            System.out.println(b);
        }
        System.out.println("Search Bus press '1' : ");

        System.out.println("Booking using bus Id Press '2'");

        System.out.println("Booking using from and to press '3'");
        int inp=scanner.nextInt();
        if(inp==1) {
            searchBus();
        } else if (inp == 2) {
            System.out.print("Enter the Bus id : ");
            int busIdInp=scanner.nextInt();
            Bus b=checkByBusID(busIdInp);
            System.out.println(b);
            if(b.id!=0){
                System.out.print("Want to book that bus press '1': ");
                int num=scanner.nextInt();
                if(num==1){
                    User user= getUserDetails();
                    System.out.print("Enter '1' to confirm booking ");
                    int confirm=scanner.nextInt();
                    if(confirm==1){
                   Booking booking= confirmBook(user,b);
                    generateTicket(booking);}
                }
            }
        } else if (inp==3) {
            searchBus();

        }
    }
}
