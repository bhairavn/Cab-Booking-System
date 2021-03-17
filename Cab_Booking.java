import java.io.*;
import java.text.*;
import java.util.*;
import java.lang.*;
import calculation.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JFrame;


interface payment{

    void invoice(String a,String b,String c,String d,String e,String f,String g,double h);

}

class gui extends JFrame
{

     static String pin;
    static Boolean p=false;

    static void add(String s)
    {
        pin=s;

    }

    static void mainmenu(String ci,String cmo,String boid,String pi,String di,String dr,double ch)
    {
        JFrame fi = new JFrame("label");     
fi.setSize(900,600);
fi.setLayout(null);
fi.setDefaultCloseOperation(EXIT_ON_CLOSE);

ImageIcon bgi=new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\cabzo.jpg");
        Image img=bgi.getImage();
        Image t=img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        bgi=new ImageIcon(t);
        JLabel bg= new JLabel("",bgi,JLabel.CENTER);
        
        bg.setBounds(0,0,900,600);
        fi.add(bg);
        fi.setVisible(true);

//font
Font f=new Font("Serif",Font.BOLD,34); 

//header
JPanel heading = new JPanel();
heading.setBackground(new Color(0,0,0,50));
heading.setBounds(0,0,900,100);
JLabel name = new JLabel("PAYMENT",JLabel.CENTER);
name.setForeground(Color.white);
name.setBounds(300,50,300,50); 
name.setFont(f);
heading.add(name);
bg.add(heading);
bg.add(name);


//login panel
JPanel pay=new JPanel();
pay.setSize(600,300);
pay.setBackground(new Color(0,0,0,30));
pay.setBounds(150,175,600,350);
pay.setLayout(null);
bg.add(pay);    
//details
JLabel us = new JLabel("CAB_ID: ");
    us.setFont(new Font("Verdana",1,13));
    us.setForeground(Color.WHITE);
    us.setBounds(20,20,100,50);
    pay.add(us);

    JLabel us1 = new JLabel(ci);
    us1.setFont(new Font("Verdana",1,13));
    us1.setForeground(Color.WHITE);
    us1.setBounds(400,20,100,50);
    pay.add(us1);

    JLabel cm = new JLabel("CAB_MODEL: ");
    cm.setFont(new Font("Verdana",1,13));
    cm.setForeground(Color.WHITE);
    cm.setBounds(20,40,100,50);
    pay.add(cm);    

    JLabel cm1 = new JLabel(cmo);
    cm1.setFont(new Font("Verdana",1,13));
    cm1.setForeground(Color.WHITE);
    cm1.setBounds(400,40,100,50);
    pay.add(cm1); 
     
    JLabel bi = new JLabel("BOOKINGID: ");
    bi.setFont(new Font("Verdana",1,13));
    bi.setForeground(Color.WHITE);
    bi.setBounds(20,60,100,50);
    pay.add(bi);    

    JLabel bi1 = new JLabel(boid);
    bi1.setFont(new Font("Verdana",1,13));
    bi1.setForeground(Color.WHITE);
    bi1.setBounds(400,60,100,50);
    pay.add(bi1); 

    JLabel pu = new JLabel("PICKUP: ");
    pu.setFont(new Font("Verdana",1,13));
  pu.setForeground(Color.WHITE);
    pu.setBounds(20,80,100,50);
    pay.add(pu);

    JLabel pu1 = new JLabel(pi);
    pu1.setFont(new Font("Verdana",1,13));
  pu1.setForeground(Color.WHITE);
    pu1.setBounds(400,80,100,50);
    pay.add(pu1);

    JLabel ds = new JLabel("DESTINATION: ");
    ds.setFont(new Font("Verdana",1,13));
    ds.setForeground(Color.WHITE);
    ds.setBounds(20,100,120,50);
    pay.add(ds);    

    JLabel d1= new JLabel(di);
    d1.setFont(new Font("Verdana",1,13));
    d1.setForeground(Color.WHITE);
    d1.setBounds(400,100,120,50);
    pay.add(d1);    

     
    JLabel dri = new JLabel("DRIVER: ");
    dri.setFont(new Font("Verdana",1,13));
    dri.setForeground(Color.WHITE);
    dri.setBounds(20,120,100,50);
    pay.add(dri); 

    JLabel dr1 = new JLabel(dr);
    dr1.setFont(new Font("Verdana",1,13));
    dr1.setForeground(Color.WHITE);
    dr1.setBounds(400,120,100,50);
    pay.add(dr1); 

    JLabel amt = new JLabel("AMOUNT: ");
    amt.setFont(new Font("Verdana",1,13));
    amt.setForeground(Color.WHITE);
    amt.setBounds(20,140,100,50);
    pay.add(amt); 


    JLabel amt1 = new JLabel(String.valueOf((int)ch));
    amt1.setFont(new Font("Verdana",1,13));
    amt1.setForeground(Color.RED);
    amt1.setBounds(400,140,100,50);
    pay.add(amt1); 

    JLabel sn = new JLabel("ENTERPIN: ");
    sn.setFont(new Font("Verdana",1,13));
    sn.setForeground(Color.WHITE);
    sn.setBounds(20,170,250,50);
    pay.add(sn); 

    
JPasswordField pass=new JPasswordField("");
pass.setBounds(300,160,100,50);
pass.setForeground(Color.WHITE);
pass.setBackground(Color.BLACK);
pay.add(pass);


//buttons
JButton regnew=new JButton("PAY");
regnew.setBounds(300, 250, 100, 50);
regnew.setBackground(Color.BLUE);
pay.add(regnew);


//actions of buttons
regnew.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
       {
         // display/center the jdialog when the button is pressed
      //   System.out.println(pass.getText());
   // System.out.println("PAID");
    if (pass.getText().equals(pin))
    {
        p=true;
        JDialog d = new JDialog(fi, "THANK YOU", true);
        d.setLocationRelativeTo(fi);
        d.setVisible(true);
    }
}
     });
     
     JButton ex=new JButton("Exit");
ex.setBounds(450, 250, 100, 50);
ex.setBackground(Color.BLUE);
pay.add(ex);
ex.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    
   // System.out.println("exit");
    
   fi.setVisible(false);
   fi.dispose();
   }
});

   
JButton ran=new JButton("PIN");
ran.setBounds(40, 250, 100, 50);
ran.setBackground(Color.BLUE);
pay.add(ran);

ran.addActionListener(new ActionListener()
{
  public void actionPerformed(ActionEvent e)
  {
    
    String r=Cab_Booking.rand1(6);
    add(r);
    JDialog d = new JDialog(fi,r, true);
    d.setLocationRelativeTo(fi);
    d.setVisible(true);
   }
});


}


    static void Display()
    {
       
//frame    
JFrame fi = new JFrame("label");     
fi.setSize(900,600);
fi.setLayout(null);
fi.setDefaultCloseOperation(EXIT_ON_CLOSE);

ImageIcon bgi=new ImageIcon("C:\\Users\\hp\\OneDrive\\Desktop\\cabzo.jpg");

Image img=bgi.getImage();
Image t=img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
bgi=new ImageIcon(t);
JLabel bg= new JLabel("",bgi,JLabel.CENTER);

bg.setBounds(0,0,900,600);
fi.add(bg);
fi.setVisible(true);



Timer timer = new Timer(3000, new ActionListener() 
        {
             public void actionPerformed(ActionEvent e) {
                 fi.setVisible(false);
                 fi.dispose();
                 
             }
         });
         timer.setRepeats(false);
         timer.start();

        }


}

public class Cab_Booking extends registered_user 
{
    Cab_Booking(String cab_id, String cab_model, String booking_id, String pick_up_city, String destination, String payment_id,String Driver, double charges)
    {
       super(cab_id, cab_model, booking_id, pick_up_city, destination, payment_id, Driver,charges);
    }

    void invoice(String cab_id, String cab_model, String booking_id, String pick_up_city, String destination, String payment_id,String Driver, double charges)
    {
        
        System.out.println("\n\n\n\n\n\n\n\n-----------------------------Thank you for choosing cabzo---------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("Cab Id: " + cab_id + "\nCab Model: " + cab_model + "\nBooking_id: " + booking_id + "\nLocation: " + pick_up_city + "\nDestination: " + destination + "\nPayment Id: " + payment_id +"\nDriver: "+Driver+"\nAmount to Pay: " + (int)charges+"\n");
        System.out.println("------------------------------------------------------------------------------------------\n\n\n\n");
        
    }

    static String rand(int x)
    {
        String everything="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
        StringBuilder random=new StringBuilder(x);
        for(int i=0;i<=x-1;i++)
        {
            int j= (int)(everything.length()*Math.random());
            random.append(everything.charAt(j));
        }
        return random.toString();
    }

    static  String rand1(int x)
    {
        String everything="1234567890";
        StringBuilder random=new StringBuilder(x);
        for(int i=0;i<=x-1;i++)
        {
            int j= (int)(everything.length()*Math.random());
            random.append(everything.charAt(j));
        }
        return random.toString();
    }  
       

    static Vector<Customer> data = new Vector<>();
    
    
    public static void main(String[] args) throws IOException
    {
       
        gui.Display();
        
        load();
        load_stations();


        Scanner sc =new Scanner(System.in);
        String s;
        boolean login;
        loop:while (true)
        {
            loop1:
            while (true)
            {
                System.out.println("------------------------------------------");
                System.out.print("0)Register new user\n1)Login(Existing user)\n3)Exit\n");
                System.out.println("------------------------------------------");
                int choice = sc.nextInt();
                switch (choice)
                {
                    case 0 ->
                            {
                                Customer.register();
                                System.out.println("login with the registered account");
                            }
                    case 1 ->
                            {
                                s = Customer.login();
                                booking_data.clear();
                                login=true;
                                break loop1;
                            }
                    case 3 -> {
                        break loop;
                    }
                    default -> System.out.println("Wrong choice Try Again!");
                }
            }
            int temp = check_uid(s);
            load_user(s);
            load_drivers();
            loop2:
            while (true)
            {
                System.out.println("\n\n\n------------------------------------------------------------------");
                System.out.print("0)Book a cab\n1)See previous Bookings\n2)Edit Your Personal Details\n3)Exit\n");
                System.out.println("------------------------------------------------------------------");
                int ch = sc.nextInt();sc.nextLine();
                switch (ch)
                {
                    case 0:
                        int random = (int) ((Cab_details.cab0.size()-1) * Math.random());
                        int random1= (int)((Cab_details.cab_driver.size()-1)*Math.random());
                        String Driver=Cab_details.cab_driver.elementAt(random1).drivername;
                        String cab_id = Integer.toString(random);
                        String cab_model = Cab_details.cab0.elementAt(random).cab_model;

                        String booking_id = rand(8);
                        while (true)
                        {
                            System.out.println("Enter pick up city and destination:");
                            String pi_city = sc.nextLine();
                            String dest = sc.nextLine();
                            boolean y0 = false, y1 = false;
                            for (stations i : stations.station)
                            {
                                if (i.Name.equalsIgnoreCase(pi_city))
                                {
                                    y0 = true;
                                }
                                if (i.Name.equalsIgnoreCase(dest))
                                {
                                    y1 = true;
                                }
                            }
                            if (!(y0 && y1))
                            {
                                continue;
                            }
                            double pi_city_lat = 0, pi_city_lon = 0;
                            double dest_lat = 0, dest_lon = 0;
                            for (stations i : stations.station)
                            {
                                if (i.Name.equalsIgnoreCase(pi_city))
                                {
                                    pi_city_lat = i.latitude;
                                    pi_city_lon = i.longitude;
                                }
                                if (i.Name.equalsIgnoreCase(dest))
                                {
                                    dest_lat = i.latitude;
                                    dest_lon = i.longitude;
                                }
                            }
                            Calculation d=new Calculation();
                            double dis = d.dist(pi_city_lat, dest_lat, pi_city_lon, dest_lon);
                            String payment_id = rand(8);
                            double payment = dis * 3;
                            Cab_Booking r = new Cab_Booking(cab_id, cab_model, booking_id, pi_city, dest, payment_id,Driver,payment);
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.print("Cab Id: " + cab_id + "\nCab Model: " + cab_model + "\nBooking_id: " + booking_id + "\nLocation: " + pi_city + "\nDestination: " + dest + "\nPayment Id: " + payment_id +"\nDriver: "+Driver+"\nAmount to Pay: " + (int)payment+"\n");
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.print("Are you sure this is the what you want to book[y/n]");
                            
                            if (sc.next().charAt(0) == 'n') {
                                continue loop2;
                            }
                            gui.mainmenu(cab_id, cab_model, booking_id, pi_city, dest,Driver,payment);
                            r.invoice(cab_id, cab_model, booking_id, pi_city, dest, payment_id,Driver,payment);
                            booking_data.add(r);
                            registered_user_file(s);
                            break;
                        }

                        break;
                    case 1:
                        Enumeration<registered_user> en = booking_data.elements();
                         while(en.hasMoreElements())
                         {
                             registered_user u=en.nextElement();
                             System.out.print("Cab Id: " + u.cab_id + " Cab Model: " + u.cab_model + " Booking_id: " + u.booking_id + " Location: " + u.pick_up_city + " Destination: " + u.destination + " Payment Id: " + u.payment_id +" driver: "+u.Driver+" Amount to Pay: " + (int)u.charges+"\n");

                         }

                        break;
                    case 2:
                        loop3:while(true){
                            System.out.println("\n\n\n------------------------------------------------------------------------------------------");
                            System.out.println("0)Change Name\n1)Change Telephone\n2)Change Date of Birth\n3)Change Password\n4)Delete Account\n5.Exit");
                            System.out.println("------------------------------------------------------------------------------------------");
                            int l= sc.nextInt();sc.nextLine();
                            switch(l){
                                case 0:
                                    System.out.println("Enter your correct name:");
                                    data.elementAt(temp).name= sc.nextLine();
                                    break;
                                case 1:
                                    String b;
                                    do{
                                    System.out.println("Enter your correct Telephone no[10 digits]:");
                                     b=sc.nextLine();}while(!Customer.check_telephone(b));
                                    data.elementAt(temp).Telephone= b;
                                    break;
                                case 3:
                                    System.out.println("Enter your new password:");
                                    data.elementAt(temp).pwd= sc.nextLine();
                                    break;
                                case 2:
                                    String dob;
                                    do {
                                        System.out.println("Enter your correct Date of birthday[DD/MM/YYYY]:");
                                        dob=sc.nextLine();
                                    }while(!validateDate(dob));
                                    data.elementAt(temp).pwd= dob;
                                    break;

                                case 4:
                                    data.remove(temp);

                                    save_Changed_details();

                                    System.out.println("Your account is deleted");
                                    continue loop;
                                case 5:
                                    save_Changed_details();
                                    break loop3;
                                default:
                                    throw new IllegalStateException("Unexpected value: " + ch);
                            }

                        }

                    break;
                    case 3:
                        break loop2;

                }


            }
        }

    }
}

class stations
{
    static Vector<stations> station= new Vector<>();
    String Name;
    double latitude,longitude;
    stations(String Name, double latitude,double longitude)
    {
        this.Name=Name;
        this.latitude=latitude;
        this.longitude=longitude;
    }
}

class Customer
{
    public String Uid,pwd,name,dob,Telephone;
    boolean login=false;
    Customer(String Uid,String pwd,String name,String dob,String Telephone)
    {
        this.Uid=Uid;
        this.pwd=pwd;
        this.name=name;
        this.dob=dob;
        this.Telephone=Telephone;
    }
    static Scanner sc=new Scanner(System.in);
    static void register() throws IOException
    {
        String uid;
        do {
            System.out.println("Enter Unique User Id:");
            uid = sc.nextLine();
        }while(check_uid(uid));
        String pwd;

        System.out.println("Please enter your password: ");
        pwd = sc.nextLine();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String dob;
        do{
        System.out.println("Enter your dob [Format DD/MM/YYYY]");
        dob = sc.nextLine(); }while(!registered_user.validateDate(dob));
        String telephone;
        do{
        System.out.println("Enter your Telephone [Format 10 digits]");
       telephone = sc.nextLine();}while(!check_telephone(telephone));
        Customer x= new Customer(uid,pwd,name,dob,telephone);
        Cab_Booking.data.add(x);
        registered_user.save_vector();

        registered_user.create_file(Cab_Booking.data.elementAt(Cab_Booking.data.size()-1).Uid);

    }
    static int crust =0;
    private static boolean check_uid(String Uid)
    {
        int j=0;
        for(int i = 0; i< Cab_Booking.data.size(); i++)
        {
            if(Cab_Booking.data.elementAt(i).Uid.equals(Uid)){j=1;
                crust =i;}
        }
        return j==1;
    }
    private static boolean check_pas(String pas) {
        int j=0;
        if(Cab_Booking.data.elementAt(crust).pwd.equals(pas)){j=1;}
        return j==1;
    }
    static boolean check_telephone(String Telephone) {
        return Telephone.length() == 10;
    }

    static String login()
    {
        String temp;
        loop:while(true)
        {int x=3;
            while (true)
            {
                System.out.println("Enter your User Id:");
                temp = sc.nextLine();
                if (check_uid(temp))
                {
                    System.out.println("user_id found ");
                    break;
                } else
                {
                    System.out.println("user_id not found ");

                }
            }
             x = 3;
            while (x != 0)
            {
                System.out.println("Please enter your password: ");
                temp = sc.nextLine();

                if (check_pas(temp))
                {
                    System.out.println("correct password");
                    Cab_Booking.data.elementAt(crust).login=true;
                    break loop;
                }
                else
                {
                    System.out.println("incorrect password");
                }
                x--;
            }
            System.out.println("your 3 attempts are over do you wish to login again [y/n]");
            String c = sc.next();sc.nextLine();
            if(c.equals("n")){break;}

        }
        return Cab_Booking.data.elementAt(crust).Uid;
    }
}


class Cab_details
{
    public String cab_id,cab_model;
    String drivername;
    static Vector<Cab_details> cab0=new Vector<Cab_details>();
    static Vector<Cab_details> cab_driver=new Vector<Cab_details>();
    Scanner sc=new Scanner(System.in);
    Cab_details(String cab_id,String cab_model)
    {
        this.cab_id=cab_id;
        this.cab_model=cab_model;
            }
    Cab_details(String drivername)
    {this.drivername=drivername;}

}

class registered_user 
{
    static Vector<registered_user> booking_data = new Vector<>();
    public String cab_id,cab_model,booking_id,pick_up_city,destination,payment_id,Driver;
    public double charges;
    registered_user(String cab_id,String cab_model,String booking_id,String pick_up_city,String destination,String payment_id,String Driver,double charges){

        this.cab_id=cab_id;
        this.cab_model=cab_model;
        this.booking_id=booking_id;
        this.pick_up_city=pick_up_city;
        this.destination=destination;
        this.payment_id=payment_id;
        this.Driver=Driver;
        this.charges=charges;

    }

    public static void load_drivers(){
        File x = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\Drivers.txt");
        String temp;
        try {
            BufferedReader read = new BufferedReader(new FileReader(x));

            while((temp=read.readLine())!=null)
            {

                Cab_details c= new Cab_details(temp);
                Cab_details.cab_driver.add(c);}
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    public static void create_file(String user_id)
    {
        String u = "C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\Customers";
        u += "\\" + user_id + ".txt";
        System.out.println(u);
        FileOutputStream faut = null;
        try
        {
            faut = new FileOutputStream(u);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            assert faut != null;
            faut.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void save_vector() throws IOException
    {
        File x=new File("C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\database.txt");
        FileWriter f= new FileWriter(x,true);
        PrintWriter w= new PrintWriter(f);
        String u= Cab_Booking.data.lastElement().Uid + "," + Cab_Booking.data.lastElement().pwd + "," + Cab_Booking.data.lastElement().name + "," + Cab_Booking.data.lastElement().dob + "," + Cab_Booking.data.lastElement().Telephone;
        w.println(u);
        w.close();
    }

    public static  int check_uid(String Uid) {
        int j=0;
        for(int i = 0; i< Cab_Booking.data.size(); i++) {
            if(Cab_Booking.data.elementAt(i).Uid.equals(Uid)){j=i;break;}
        }
        return j;
    }

    public static void registered_user_file(String User_id)throws IOException
    {

        String u = "C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\Customers\\"+User_id+".txt";
        File f= new File(u);
        FileWriter w =new FileWriter(f,true);

        int i=booking_data.size()-1;
        w.write(booking_data.elementAt(i).cab_id + "," +
                booking_data.elementAt(i).cab_model + "," +
                booking_data.elementAt(i).booking_id + "," +
                booking_data.elementAt(i).pick_up_city + "," +
                booking_data.elementAt(i).destination + "," +
                booking_data.elementAt(i).payment_id + "," +
                booking_data.elementAt(i).Driver+ ","+
                booking_data.elementAt(i).charges);
        w.write(System.lineSeparator());
        w.close();
    }

    public static void load()
    {

        String path="C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\database.txt";
        String temp;
        try {
            BufferedReader read = new BufferedReader(new FileReader(path));

            while((temp=read.readLine())!=null)
            {
                String[] v=temp.split(",");
                Customer c= new Customer(v[0],v[1],v[2],v[3],v[4]);
                Cab_Booking.data.add(c);}
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        path="C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\cab.txt";
        try
        {
            BufferedReader read = new BufferedReader(new FileReader(path));

            while((temp=read.readLine())!=null)
            {
                String[] v=temp.split(",");
                Cab_details c= new Cab_details(v[0],v[1]);

                Cab_details.cab0.add(c);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void load_user(String uid)
    {
        String path="C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\Customers";
        path+="\\"+uid+".txt";
        String temp;
        try
        {
            BufferedReader read = new BufferedReader(new FileReader(path));

            while((temp=read.readLine())!=null)
            {
                String[] v=temp.split(",");
                double x=Double.parseDouble(v[7]);
                registered_user o=new registered_user(v[0],v[1],v[2],v[3],v[4],v[5],v[6],x);
                booking_data.add(o);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void load_stations()
    {
        String path="C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\Stations.txt";
        String temp;
        try{
            BufferedReader read = new BufferedReader(new FileReader(path));
            while((temp=read.readLine())!=null)
            {
                String[] y=temp.split(",");
                double x=Double.parseDouble(y[1]);
                double z=Double.parseDouble(y[2]);
                stations s=new stations(y[0],x,z);
                stations.station.add(s);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    static void save_Changed_details()throws IOException{
    File x = new File("C:\\Users\\hp\\OneDrive\\Desktop\\Database.dir\\database.txt");
    FileWriter w= new FileWriter(x);

    for(Customer i :Cab_Booking.data){if(i!=null){w.write(i.Uid + "," + i.pwd + "," +i.name + "," + i.dob + "," +i.Telephone);w.write(System.lineSeparator());}}
    w.close();

    }
    public static boolean validateDate(String strDate) {
        if (strDate.trim().equals("")) {
            return true;
        } else {
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
            sdfrmt.setLenient(false);
            try {
                Date javaDate = sdfrmt.parse(strDate);

            } catch (ParseException e) {
               ;
                return false;
            }
            return true;
        }
    }

 

}