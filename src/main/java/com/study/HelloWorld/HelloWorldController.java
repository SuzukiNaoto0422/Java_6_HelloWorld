package com.study.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class HelloWorldController {
    @RequestMapping("hello")//value属性だけなら省略できる。value = "/hello"
    public String hello() {
        LocalDateTime now =LocalDateTime.now();
        //現在の日時を取得するために LocalDateTime.now()を使用し、現在時刻を取得
        LocalTime localTime = now.toLocalTime();
        //現在の時間だけを取得するために、now.toLocalTime()を使用し、LocalTime型のインスタンスを取得
        return String.format("Hello World!<br>現在時刻は%s時%s分%s秒です。", now.getHour(), now.getMinute(), now.getSecond());
        //取得した現在時刻から hour, min, sec を取得するために、now.getHour() 、now.getMinute() 、 now.getSecond() を使用
        //現在時刻は%s時%s分%s秒です。" の形式で返すためにString.formatを使用
        //String.format()メソッドは、文字列に変数を埋め込んで、文字列を生成するために使用される
    }
}
