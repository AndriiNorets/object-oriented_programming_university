package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable{
    String name;
    int[] goals = new int[5];

    public FootballPlayer(){}
    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = Arrays.copyOf(goals,goals.length);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FootballPlayer result = (FootballPlayer)super.clone();
        result.goals = Arrays.copyOf(goals,goals.length);
        return result;
    }
    void changeValue(int element,int index){
        goals[index] = element;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }
}
class TestFootballPlayer{
    public static void main(String[] args) {
        FootballPlayer f1 = new FootballPlayer("Vasio",new int[]{1,1,7,3,4,10});
        FootballPlayer f2 = new FootballPlayer();
        try{
            f2 = (FootballPlayer) f1.clone();
            f1.changeValue(16,4);
            System.out.println(f1);
            System.out.println(f2);
        }catch (CloneNotSupportedException e){
            System.out.println(e.getLocalizedMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
