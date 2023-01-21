﻿#                               Перечисления в Java

### Задание 1

В ранее реализованную модель для автомобильных гонок добавьте для каждой категории перечисления. Для каждого перечисления нужно определить аргументы и метод toString для вывода данных аргументов.

Для класса «Легковых автомобилей» тип кузова:

- «Седан»,
- «Хетчбек»,
- «Купе»,
- «Универсал»,
- «Внедорожник»,
- «Кроссовер»,
- «Пикап»,
- «Фургон»,
- «Минивэн».

*Подсказка*

_Русское название типа кузова должно быть аргументом для каждой константы перечисления, то есть должно быть передано в параметр конструктора при создании элемента enum. А toString должен быть реализован в виде Тип кузова: <Название типа кузова на русском языке>._

Для грузовых автомобилей добавьте перечисления по типу грузоподъемности:

- N1 (с полной массой до 3,5 тонн);
- N2 (с полной массой свыше 3,5 до 12 тонн);
- N3 (с полной массой свыше 12 тонн);

*Подсказка-1*

_Верхнюю и нижнюю границы грузоподъемности нужно указать в виде Float значений в enum. А toString должен выводить значения вида Грузоподъемность: "от <нижняя граница> тонн до <Верхняя граница> тонн"_

*Подсказка-2*

_Если одной из границ не существует, ее можно передать как null значение и обработать null в toString. Если какая-то из границ null, то фраза должна изменяться. Например, если нижняя граница null, то возвращаемое значение в toString будет Грузоподъемность: "до <Верхняя граница> тонн"._

А для автобусов добавьте классификацию с помощью перечислений по типу вместимости:

- особо малая (до 10 мест);
- малая (до 25);
- средняя (40–50);
- большая (60–80);
- особо большая (100–120 мест).

*Подсказка-3*

_В этом перечислении нижняя и верхняя границы вместимости должны быть реализованы с помощью Integer, а toString должен выводить значения в виде_

_"Вместимость: <нижняя граница> - <верхняя граница> мест"._

_Если одной из границ нет, то реализация toString должна работать так же, как в случае с грузоподъемностью._

### *Критерии проверки*

- Реализовано перечисление для класса «Легковые автомобили».
- Реализовано перечисление для класса «Грузовые автомобили».
- Реализовано перечисление для класса «Автобусы».

### Задание 2
В каждый класс транспортного средства необходимо добавить поле, которое содержит его тип, а также геттер и сеттер для этого поля, причем в разных классах транспортных средств будут разные типы.

В абстрактный класс Transport нужно добавить абстрактный метод printType, который выводит в консоль значение типа транспортного средства, или если тип транспортного средства не указан, то строку вида "Данных по транспортному средству недостаточно".

### *Критерии оценки*
- В класс «Легковые автомобили» добавлено поле enum
- Созданы геттеры и сеттеры для данного поля
- В класс «Грузовые автомобили» добавлено поле enum
- Созданы геттеры и сеттеры для данного поля
- В класс «Автобусы» добавлено поле enum
- Созданы геттеры и сеттеры для данного поля
- Создан абстрактный метод printType в абстрактном классе Transport
- Если тип транспортного средства не указан, то метод printType выводит строку вида "Данных по транспортному средству недостаточно".
