//Лазарєв Матвій
//Мій варіант 12
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<SmallCar> smallCars = new ArrayList<>();
        ArrayList<MediumCar> mediumCars = new ArrayList<>();
        ArrayList<BigCar> bigCars = new ArrayList<>();
        ArrayList<Doll> dolls = new ArrayList<>();
        ArrayList<Ball> balls = new ArrayList<>();
        ArrayList<Cube> cubes = new ArrayList<>();
        System.out.println("Welcome to our kids room!");
        System.out.println("We have available:" +"\n•large, medium, small cars;" +
                "\n•dolls;" + "\n•balls;" + "\n•cubes.");


        smallCars.add(new SmallCar("White", "Toyota iQ", 15, 6));
        smallCars.add(new SmallCar("Red", "Fiat Seicento",20, 6));
        smallCars.add(new SmallCar("Orange", "Chevrolet Spark",25, 6));
        smallCars.add(new SmallCar("Blue", "Mercedes SMART", 20, 6));

        mediumCars.add(new MediumCar("Blue", "Kia Rio LX", 30, 5));
        mediumCars.add(new MediumCar("Black", "Tesla Model Y", 90, 5));
        mediumCars.add(new MediumCar("Yellow", "McLaren 570S",  100, 5));
        mediumCars.add(new MediumCar("White", "Lada 2110",  250, 5));

        bigCars.add(new BigCar("Black", "Coggiola T-Rex", 50, 3));
        bigCars.add(new BigCar("Chromium-plated", "Ford F-250 SuperChief",  60, 3));
        bigCars.add(new BigCar("Orange", "Kamaz",  70, 3));

        dolls.add(new Doll("flesh color", "Winx",  120, 2));
        dolls.add(new Doll("flesh color", "Barbie",  140, 2));
        dolls.add(new Doll("flesh color", "Monster high",  160, 2));

        balls.add(new Ball("Green", "Ball for tennis",  30, 3));
        balls.add(new Ball("Blue & Yellow", "Ball for volleyball",  60, 3));
        balls.add(new Ball("White & Black", "Ball for football",  80, 3));
        balls.add(new Ball("Orange & Black", "Ball for basketball",  90, 4));

        cubes.add(new Cube("Colored", "Cubes",  20, 3));
        cubes.add(new Cube("Colored with letters", "Cubes",  35, 3));
        cubes.add(new Cube("Multi-colored", "Rubik's",  80, 6));




        SmallCar[] arrSmallCars = new SmallCar[smallCars.size()];
        MediumCar[] arrMediumCars = new MediumCar[mediumCars.size()];
        BigCar[] arrBigCars = new BigCar[bigCars.size()];
        Doll[] arrDolls = new Doll[dolls.size()];
        Ball[] arrBalls = new Ball[balls.size()];
        Cube[] arrCubes = new Cube[cubes.size()];
        arrSmallCars = smallCars.toArray(arrSmallCars);
        arrMediumCars = mediumCars.toArray(arrMediumCars);
        arrBigCars = bigCars.toArray(arrBigCars);
        arrDolls = dolls.toArray(arrDolls);
        arrBalls = balls.toArray(arrBalls);
        arrCubes = cubes.toArray(arrCubes);

        Operation operation = new Operation();
        operation.loadRoom(arrSmallCars , arrMediumCars, arrBigCars, arrBalls, arrDolls, arrCubes, 1500);
        operation.printLoad();
        operation.getLoad().sort(new ComparatorPrice());
        System.out.println("\n\n\n\n");

        operation.printLoad();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Min price: ");
            double minPrice = scanner.nextDouble();
            System.out.println("Max price: ");
            double maxPrice = scanner.nextDouble();
            operation.finderGivenRange(minPrice, maxPrice).forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Wrong input, input must be number, fractional part must be entered after ','");
        }

    }
}
