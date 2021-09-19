package day26a;

public class MDAP2 {
    public static void main(String[] args) {
        String[][] cybertekGroups = {
                {"Ahmed", "Ahmet", "Igor", "Andrei", "Mykyta"},  //0
                {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende", "Serife", "Collins", "Akangankoy", "Liubov"},
                {"Oz", "Ibrahim", "Ahmed", "Davut", "Dontrell", "Muahmmed"},
                {"Inesa", "Aysu", "Suat", "Esra", "Ahmed", "Yusuf", "Mohamed", "Tinbite", "Raphael"},
                {"Selda", "Ibrahim", "Tamerlan", "Mehmut", "Sina"}
        };

        int count = 0;
        for (String[] eachGroup : cybertekGroups) {
            for (String eachName : eachGroup) {
                if (eachName == "Ahmed") {
                    count++;
                }
            }

        }
        System.out.println("count = " + count);
    }
}
