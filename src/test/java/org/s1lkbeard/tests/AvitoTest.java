package org.s1lkbeard.tests;

import org.junit.Test;
import org.s1lkbeard.framework.pages.MainPage;
import org.s1lkbeard.tests.base.BaseTests;

public class AvitoTest extends BaseTests {

    MainPage mainPage = new MainPage();

    @Test
    public void test() {
        //2 - выбор категории
        mainPage.clickField("Все категории")
                .clickField("Электроника")
                .clickField("Оргтехника и расходники")
        //3 - ввод в поиск "Принтер"
                .fillField("Поиск по сайту","Принтер")
                .clickField("Найти")
        //4 - выбор для отображения новых товаров
                .clickField("Новое")
        //5-7 - выбор региона
                .clickField("Выбрать регион")
                .clickField("Удалить выбранный регион")
                .fillField("Поиск по региону","Владивосток")
                .clickField("Выбрать первый вариант")
                .clickField("Показать результаты")
        //8 - выбор сортировки "Дороже"
                .clickField("Сортировка")
                .clickField("Дороже")
        //9 - вывод первых 5 результатов поиска в консоль
                .printResult(5);
    }
}
