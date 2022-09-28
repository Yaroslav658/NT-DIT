package Lab3;

public class Player {
    String name;
    Player(String name){
        this.name = name;
    }
    int wins;
    int loses;
    String getName(){
        return name;
    }
    String getInformation(){
        return "Name: "+name+", Wins: "+wins+", Loses: "+loses;
    }
    void win(){
        System.out.println(getName()+" win!");
        wins++;
    }
    void lose(){
        loses++;
    }

//    В класі ігрока поля реалізувати методи:
//
// - ход ігрока( запит на місце розташування фігури);
//
// - ввод та вивід інформації про ігрока.
}
