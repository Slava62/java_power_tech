package ru.powertech.ylukomoria.data;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TestData {
    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Инфраструктура","Пляж"),
                Arguments.of("Инфраструктура","Беседки"),
                Arguments.of("Инфраструктура","Пешие и велодорожки"),
                Arguments.of("Инфраструктура","Летние веранды"),
                Arguments.of("Инфраструктура","Детские площадки"),
                Arguments.of("Инфраструктура","Банкетный зал"),
                Arguments.of("Инфраструктура","Искусственный водоем"),
                Arguments.of("Инфраструктура","Кинотеатр"),
                Arguments.of("Инфраструктура","Танцевальная площадка"),
                Arguments.of("Инфраструктура","Зона барбекю"),
                Arguments.of("Инфраструктура","Спортивные площадки"),
                Arguments.of("Инфраструктура","Парковка"),
                Arguments.of("","Бронирование"),
                Arguments.of("Кафе","Меню и цены"),
                Arguments.of("","Контакты"),
                Arguments.of("","О нас")
                //,Arguments.of("Корпоративным клиентам","Проведение выездных мероприятий")
        );}
}
