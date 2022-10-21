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
        w.PrintMenu();
        System.out.println("������ ���� ������ ����");
        do {
            try {
                int number = Integer.parseInt(reader.readLine());
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
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InvalidAnimalCountException e) {
                System.err.println("������ �������� ������� ������");
            } finally {
                w.PrintMenu();
                System.out.println("������ ���� ������ ����");
            }
        }while (!choise) ;
    }
}
