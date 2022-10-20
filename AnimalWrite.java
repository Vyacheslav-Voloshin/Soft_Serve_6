import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AnimalWrite {
    private int animalcount;

    ArrayList<String> array1 = new ArrayList<>();
    public void AnimalWriting()  {
        if (animalcount<=0) {
            System.out.println("¬вед≥ть спочатку к≥льк≥сть тварин");
        } else
            for (int i = 1; i <= animalcount; i++) {
                try {
                    System.out.println("¬вед≥ть тип " + i + " тварини");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String animaltype = reader.readLine();
                    array1.add(animaltype);
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
    }
    public void AnimalPrint (){
        if (!array1.isEmpty()==true) {
            System.out.println("—писок тварин:"+array1);
        } else
            System.out.println("—писок тварин пустий");
    }
    public void AnimalCount(){
        System.out.println("¬вед≥ть к≥льк≥сть тварин");
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        animalcount = Integer.parseInt(q);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void PrintMenu(){
        System.out.println("1. ¬вед≥ть к≥льк≥сть тварин");
        System.out.println("2. ¬вед≥ть тип тварини");
        System.out.println("3. ¬иведенн€ списку тварин на екран");
        System.out.println("4. ¬их≥д ≥з програми");
    }

}
