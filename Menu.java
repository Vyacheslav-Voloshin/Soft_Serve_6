import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void Menu1()  {
        boolean choise = false;
        AnimalWrite w = new AnimalWrite();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*******************************************************************************************************");
        System.out.println("�������� ���  ����� ������ ������ � ������� �� ���������� ������ �� ���������� ������ �������� ������");
        System.out.println("*******************************************************************************************************");
        do {
            try {
                w.PrintMenu();
                System.out.println("������ ���� ������ ����");
                String s = reader.readLine();
                int number = Integer.parseInt(s);
                switch (number) {
                    case 1:
                        w.AnimalCount();
                        break;
                    case 2:
                        w.AnimalWriting();
                        break;
                    case 3:
                        w.AnimalPrint();
                        break;
                    case 4:
                        choise = true;
                        break;
                    default:
                        System.out.println("������ ������ ���� �� ����");
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        } while (!choise) ;
    }
}
