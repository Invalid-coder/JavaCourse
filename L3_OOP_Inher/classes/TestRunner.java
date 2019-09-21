package classes;
import java.util.Random;

abstract class AbstractQuest {
    private long id;
    private String questContent;
            // ������������ � ������
    public abstract boolean check(Answer ans);
}
class DragnDropQuest extends AbstractQuest {
            // ����, ������������ � ������
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n'Drop quest");
            // �������� ������������ ������ (true ��� false)
        return true; // stub
    }
}
class SingleChoiceQuest extends AbstractQuest {
           // ����, ������������ � ������
    @Override
    public boolean check(Answer ans) {
        System.out.println("Single choice quest");
           // �������� ������������ ������ true ��� false
        return true; // stub
    }
}

 class Answer {
    // ���� � ������
}
 class QuestFactory { // ������ Factory Method (����������)
public static AbstractQuest getQuestFromFactory(int mode) {
     switch (mode) {
               case 0:
                         return new DragnDropQuest();
               case 1:
                         return new SingleChoiceQuest();
               default :
                         throw new IllegalArgumentException("illegal mode");
                         // assert false; // �����
                         // return null;  // ��� ����
     }
}
}
 class TestAction {
public AbstractQuest[] generateTest(final int NUMBER_QUESTS, int maxMode) {
     AbstractQuest[ ] test = new AbstractQuest[NUMBER_QUESTS];
     for (int i = 0; i < test.length; i++) {
                  int mode = new Random().nextInt(maxMode); // stub
                  /* ���������� ������� ���������-��������� */
                  test[i] = QuestFactory.getQuestFromFactory(mode);
     }
     return test;
}
public int checkTest(AbstractQuest[] test) {
     int counter = 0;
     for (AbstractQuest s : test) {
               // ����� ������������ ������
               counter = s.check(new Answer()) ? ++counter : counter;
     }
     return counter;
}
}
public class TestRunner {
public static void main(String[ ] args) {
TestAction bt = new TestAction();
AbstractQuest[ ] test = bt.generateTest(60, 2); // 60 �������� 2-� �����
// ����� ������ ���� ��� �������� ����������� ����� �
bt.checkTest(test); // �������� �����
}
}

