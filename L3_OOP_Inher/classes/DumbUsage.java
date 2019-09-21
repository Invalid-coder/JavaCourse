package classes;

class Dumb extends Object {
    { this.id = 6; }
    int id;
    Dumb() {
             System.out.println("����������� ������ Dumb ");
     // ������ ���������� ����������� ������ - �� ������
             id = this.getId(); 
             System.out.println(" id=" + id);
    }
    int getId() { // 1
             System.out.println("getId() ������ Dumb ");
             return id;
    }
}

class Dumber extends Dumb {
    int id = 9; // ��������� ��� ���� � ����������� �������
    Dumber() {
             System.out.println("����������� ������ Dumber ");
             id = this.getId();
             System.out.println(" id=" + id);
    }
    @Override
    int getId() { // 2
             System.out.println("getId() ������ Dumber ");
             return id;
    }
}

public class DumbUsage {

	public static void main(String[] args) {
		 Dumb�objA�=�new�Dumber();
	}
}
/*
�����������������Dumb
getId()�������Dumber
id=0
�����������������Dumber
getId()�������Dumber
id=9
*/