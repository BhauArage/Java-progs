public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private int needed_time_in_oven=40;

    public int expectedMinutesInOven(){
        return needed_time_in_oven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time_in_oven){
        return needed_time_in_oven-time_in_oven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return 2*layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int time_in_oven){
        return preparationTimeInMinutes(layers)+time_in_oven;
    }
}
