package classes;

class CardAction {
    float amount;
    public void doPayment(double d) {
             // ���������
             System.out.println("complete from debt card");
             amount -= d; 
    }
}
class CreditCardAction extends CardAction {
	final float payLimit = 1000.0f;
    public boolean checkCreditLimit() { // ����� �����
             return (amount>0); // stub
    }
    @Override // �� �������� ����� �� ���������� 
    public void doPayment(double amountPayment) { // �������������� �����
            System.out.println("complete from credit card");
            if (checkCreditLimit()){
            	amount -= amountPayment; 
            }
    }
}


public class Polymorph {
    public static void main(String[ ] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
        // CreditCardAction cca = new CardAction(); // ������� ���������
        dc1.doPayment(15.5); // ����� ����� CardAction
        dc2.doPayment(21.2); // ���������� ����� ����� CreditCardAction
        cc.doPayment(7.0); // ���������� ����� ����� CreditCardAction
        cc.checkCreditLimit(); // ������������ ����� ����� CreditCardAction
        // dc2.checkCreditLimit(); // ������� ���������� � ������������ �����
        ((CreditCardAction)dc1).checkCreditLimit(); // ������� �� ��� ���������
        ((CreditCardAction)dc2).checkCreditLimit(); // ��
   }
}
