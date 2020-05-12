package club.banyuan;

/**
 * 定义可以赚取奖金的主管
 */
public class Executive extends Employee {

    private double bonus;

    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;
    }


    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    public double pay() {
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }