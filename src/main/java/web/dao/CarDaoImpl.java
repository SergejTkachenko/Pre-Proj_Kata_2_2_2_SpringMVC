package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", 3, "Black"));
        carList.add(new Car("BMW", 4, "Yellow"));
        carList.add(new Car("Lada", 5, "Green"));
        carList.add(new Car("Skoda", 6, "Red"));
        carList.add(new Car("Volvo", 7, "Blue"));
        carList.add(new Car("Chevrolet", 8, "White"));
        carList.add(new Car("Dodge", 9, "Orange"));
    }
    @Override
    public List<Car> getCarList(int count) {
        if (count == 0 || count >= 5 || count < 0) {
            return carList;
        }
        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
