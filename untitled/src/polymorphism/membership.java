package polymorphism;

import java.util.ArrayList;

class Customer {
    public int point;
    public String customerGrage;
    public String customerID;

    public String customerName;
    public double sale;
    public double ratio; // 적립비율

    public Customer(String customerID, String customerName){
        this.customerName = customerName;
        this.customerID = customerID;
        this.customerGrage = customerGrage;
        this.point = 0;
        this.sale = 0;
    }
    public void CustomerInfo(){
        System.out.println(this.customerName+"님의 등급은"+this.customerGrage+"이며, 보너스 포인트는 "+this.point+"입니다");
    }
    public int calcPrice(int price){
        this.point += (int)(price * this.ratio);
        return price - (int)(price * this.sale);
    }

}
class GoldCustomer extends Customer {
    public GoldCustomer(String customerID, String customerName){
        super(customerID, customerName);
        this.customerGrage = "GOLD";
        this.sale = 0.1;
        this.ratio = 0.02;
    }

}
class VipCustomer extends Customer {
    public VipCustomer(String customerID, String customerName){
        super(customerID, customerName);
        this.customerGrage = "VIP";
        this.sale = 0.2;
        this.ratio = 0.05;
    }
}
class NormalCustomer extends Customer {
        public NormalCustomer(String customerID, String customerName){
            super(customerID, customerName);
            this.customerGrage = "NORMAL";
            this.sale = 0;
            this.ratio = 0.01;
        }
}
public class membership {
    public static void main(String[] args){
        Customer parkCustomer = new NormalCustomer("100", "park");
        Customer kimCustomer = new VipCustomer("101", "kim");
        Customer choiCustomer = new GoldCustomer("102", "choi");

        int price = 1000;

        parkCustomer.CustomerInfo();
        kimCustomer.CustomerInfo();
        choiCustomer.CustomerInfo();

        System.out.println("===============구매내역=============");

        System.out.println(parkCustomer.calcPrice(price));
        System.out.println(kimCustomer.calcPrice(price));
        System.out.println(choiCustomer.calcPrice(price));


        parkCustomer.CustomerInfo();
        kimCustomer.CustomerInfo();
        choiCustomer.CustomerInfo();

        System.out.println(" ===============ArrayList==============");
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(parkCustomer);
        customerList.add(kimCustomer);
        customerList.add(choiCustomer);

        price = 20000;
        for(Customer ct : customerList){
            int cost = ct.calcPrice(price);
            System.out.println(ct.customerName+"님이 "+cost+"원 지불하셨습니다.");
            System.out.println(ct.customerName+"님의 현재 보너스 포인트는" + ct.point + "원 입니다.");
        }

        System.out.println(" ============== ArrayList SystemInfo =============");
        for( Customer ct : customerList ) {
            ct.CustomerInfo();
        }
    }
}
