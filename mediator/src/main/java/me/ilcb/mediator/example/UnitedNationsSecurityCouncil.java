package me.ilcb.mediator.example;

/**
 * 中介者抽象
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private USA colleague1;
    private Iraq colleague2;

    public USA getColleague1() {
        return colleague1;
    }

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public Iraq getColleague2() {
        return colleague2;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    public void declare(String message, Country country){
        if (country == colleague1){
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }

}
