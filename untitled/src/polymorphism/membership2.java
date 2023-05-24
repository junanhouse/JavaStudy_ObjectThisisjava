package polymorphism;

import java.util.ArrayList;

class Customer2 { // 만약 기존
    public String customerID;
    public String customerName;
    public int point;
    public Customer2(String customerID, String customerName){
        this.customerName = customerName;
        this.customerID = customerID;
        this.point = 0;
    }
    public String[] getCustomerInfo(){
        return new String[]{ customerID, customerName };
    }
    public int getPoint(){
        return this.point;
    }
    public int calcPrice(int price){
        this.point += price * 0.001;
        return this.point;
    }
}
class NewMembership{
    public Customer2 customer;
    public String customerGrade;
    public double sale;
    public double ratio;
    public NewMembership(Customer2 customer){
        this.customer = customer;
    }

    public int calcPrice(int price){
        this.customer.point += (int)(price * this.ratio);
        return price - (int)(price * this.sale);
    }
    public String getCustomerGrade(){
        return this.customerGrade;
    }
}

class GoldMembership extends NewMembership {
    public GoldMembership(Customer2 customer){
        super(customer);
        this.customerGrade = "GOLD";
        this.sale = 0.1;
        this.ratio = 0.02;
    }
}
class VipMembership extends NewMembership {
    public VipMembership(Customer2 customer){
        super(customer);
        this.customerGrade = "VIP";
        this.sale = 0.2;
        this.ratio = 0.05;
    }
}
class NormalMembership extends NewMembership {
    public NormalMembership(Customer2 customer){
        super(customer);
        this.customerGrade = "NORMAL";
        this.sale = 0;
    }
}
public class membership2 {
    public static void main(String[] args){
        int price;
        Customer2 parkCustomer = new Customer2("100", "park");
        Customer2 kimCustomer = new Customer2("101", "kim");
        Customer2 choiCustomer = new Customer2("102", "choi");
        System.out.println(parkCustomer.getCustomerInfo()[1] + "님 반갑습니다.");
        System.out.println(kimCustomer.getCustomerInfo()[1] + "님 반갑습니다.");
        System.out.println(choiCustomer.getCustomerInfo()[1] + "님 반갑습니다.");

        NewMembership parkMembership = new NormalMembership(parkCustomer);
        NewMembership kimMembership = new GoldMembership(kimCustomer);
        NewMembership choiMembership = new VipMembership(choiCustomer);

        System.out.println(" ===============ArrayList==============");
        ArrayList<NewMembership> customerList = new ArrayList<NewMembership>();
        customerList.add(parkMembership);
        customerList.add(kimMembership);
        customerList.add(choiMembership);

        for(NewMembership ct : customerList){
            System.out.println(ct.customer.customerName+"님의 등급은 "+ct.getCustomerGrade()+"입니다.");
        }

        price = 20000;

        System.out.println("========20000원 상품 구매 ===========");
        for(NewMembership ct : customerList){
            int cost = ct.calcPrice(price);
            System.out.println(ct.customer.customerName+"님이 "+cost+"원 지불하셨습니다.");
            System.out.println(ct.customer.customerName+"님의 적립 후 포인트는" + ct.customer.point + "원 입니다.");
        }

        price = 10000;
        System.out.println("========10000원 상품 구매 ===========");
        for(NewMembership ct : customerList){
            int cost = ct.calcPrice(price);
            System.out.println(ct.customer.customerName+"님이 "+cost+"원 지불하셨습니다.");
            System.out.println(ct.customer.customerName+"님의 적립 후 포인트는" + ct.customer.point + "원 입니다.");
        }

        System.out.println(" ============== ArrayList SystemInfo =============");
        for( NewMembership ct : customerList ) {
            System.out.println(ct.customer.customerName+"님의 현재 포인트는 " + ct.customer.getPoint() + "입니다.");
        }
        System.out.println("NEW MEMBERSHIP");
    }
}
