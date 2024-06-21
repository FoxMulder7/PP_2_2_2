package web.dao;


import org.springframework.stereotype.Repository;
import web.car.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "Мерс", "синий"));
        carList.add(new Car(2, "бмв", "красная"));
        carList.add(new Car(3, "бмв", "черная"));
        carList.add(new Car(4, "уаз", "черный"));
        carList.add(new Car(5, "тойота", "белая"));
    }

    @Override
    public List<Car> getList() {
        return carList;
    }
}