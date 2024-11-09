public class Main {
    public static void main(String[] args) {
        // Создание объекта Post
        Post post = new Post();

        // Заполнение основных полей объекта Post
        post.name = "Иван";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999) 999-99-99";
        post.subscription = true;

        // Создание и заполнение объекта FormDate для даты рождения
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        // На этом этапе объект post полностью инициализирован
    }
}

