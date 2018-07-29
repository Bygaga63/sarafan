package com.home.sarafan.domain;


//Класс для того что бы отдавать json в желаемом виде
//помечаем каждое поле класса аннотацией @JsonView, тем интерфейсом которым хотим
//и в контроллерах помечаем методы @JsonView тем что хотим вернуть.
//Пример: @JsonView(Views.Id.class)
public final class Views{
    public interface Id {}
    public interface IdName extends Id{}
    public interface FullMessage extends Id{}
}
