## Студент

*Андрианов Дмитрий Михайлович*, группа **GU-Программирование-4**

## Задание

1) Создаем классы **Cpu**, **Ram**, **MotherBourd** (и другие части комюьтера);
2) Создаем класс **Desktop** с полями в виде предыдущих созданных классов;
3) Создаем типизированные сервисы для работы с частями компьютера (по сервису на класс!);
4) Применяем шаблон проектирования *Builder*, посредством создания класса Настольный компьютер билдер, передачи в него описания желаемых характеристики(для примера setRam(16)), и создания компьютера(пример buildt() в нем вызываем сервисы для фильтрации по желаемому критери из списка заранее созданных деталей);
5) Создаем контролер с методом *дайКомпьютерПоЖелаемымКритериям* (String критерии...)
в нем создаем билдер и наполняем его переданными критериямм и возвращаем компьютер;
6) В **main** демонстрируем.

___
