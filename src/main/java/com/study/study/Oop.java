package com.study.study;

public class Oop {
    public static void main(String[] args) {
        //객체(인스턴스) - 변수와 함수를 가지고 있다 (new)
        // 데이터 + 기능 = 객체(컴퓨터)
        //변수 - 값을 저장할수 있는 공간 int(자료형) a(변수) =8-> 변수와 선언
        //메서드=함수 -  ex) void channelUp () {  } 리턴타입이 없으면 void
        // 리턴타입이 있으면 메서드 명 앞에 자료형을 붙여서 리턴을 받는다
        // 매개변수(자료형+변수명)

        // null 주는 이유 //
// return 사용법
// 클래스에 각각 뭐가 적혀야 하는지 감을 못잡겠당 1. 필드  2.생성자(new)


// 연결된 코드로 가는 단축키있나?? 호출한다?? //연결의 개념(호출) 주소참조 이어지는 길을 못찾겠다 membermain
//.을붙이면 연결된다는 뜻?// 주소호출 전달?? 부른다는뜻?/ / . 참조
//딱 봤을때 이게 클래스인지 메소드인지 생성자인지 알수 있는 기본 형이 있나???->> 대충 ㅇㅋㅇㅋ,
//
//자료형? 클래스 자료형  -클래스 자료형(Product, Student) 같은건 정해진 모양이없다 그래서 그모양에 맞는 값을 넣어줘야해
//                             int a =10; 은 int 도 동그라미 10도 동그라미라서 리터럴로 정해져있어서 정수형이 대입가능하다
//                             하지만 클래스 자료형은 정해진 리터럴이 없기때문에 만들어줘야한다 그게 생성자)
//                             EX) Product product = new product()
//                                 새로운 자료형           생성자해서 새로운자료형에 모양에 맞게 만든다라고 생각하자
// 클래스는 그래서 틀이라는 내용@@
//
        /*
            자바를 이해하는 제일 중요한 요소= 클래스의 이해
            이해 기준 = > 클래스 사용 이유 = > 클래스를 어떤 기준으로 빼야하나 = 정보를 묶으려고
            데이터를 저장한다 => 메모리에 저장한다 => 메모리 공간안에 데이터가 있다.
            => 프로그램 하나를 실행시키면 스택메모리가 실행 된다  => 공간은 정해져있다 한번지정되면
            껏다키지 않는 한 바뀌지 않는다 그리고 나머지 여유공간이 있는데 그 공간을 빌리겠다 그공간을
            힙메모리 공간이라고 한다. => <공간들이 존재한다.>
             메모리 하나당 하나의 지역이라고 생각하자 그리고 지역은 나눠져있다.
             여러개의 데이터가 묶여야지만 하나의 객체가 된다 => 객체화 ex)학생의 정보들로 이루어진 학생
             틀이정해져있다  ex)이름/주소/성적(과목 코드 ,과명명, 학점, 자신의 성적) 학생=> 성적이라는 객체를 품고있다
             다른사람들의 성적표에도 같은데이터가 쓰인다  객체가 객체를담고 객체가 객체를 담는다
             각각의 객체들을 리스트에 담자 라는 개념-> 리스트를 생성해서 각자의 과목을 add하자 리스트 = 데이터집합 =객체
             정보를 묶기위해 객체라는 말은하는데 객체가 다양하다
             ex)리스트라는 형태/과목이라는형태/학생이라고하는형태 => 자료형 이라고 하자
             처음엔 자료형이 없으니까 없으니까 new해서 만들어주자
             주소를 적어라, 성적을기입해라는 학생의 자료 메소드 => 기능 =>기능을 묶어서 객체

             추상화 => 공통점을 분리
             A라는 클래스에 String name;/String age;
             B라는 클래스에 String name;/Stirng phone;
             공통점인 name;
             C라는 클래스를 만들어서 공통점인 name;을 넣고
             A와 B의 name;을 지우겠다
             만약 A와B의 같은 메소드 VOID TEST(AAA)가있으면 둘다 지우고
             C에 상속시켜서 C에만 (AAA)하겠다
             *재정의 이해 하장
             만약 List<c>를 쓰면 c를 쓸수 있는데 c에 상속받은 a와b도 같이 사용할수있다
             a=c=b
             c는 단순히 묶기위해서 만든개념(부모클래스) c자체만으로는 의미가 없다 구체화된것들(a,b)이 중요하다
             그래서 c안에 메소드는 추상메서드라고 말한다 봐도 잘모름 어차피 기능이 만들어지지 않음 기능은 a,b가
             담당 그래서 c가 설계만 하고 추상메서드를 가진 추상클래스가 나왔다

             인터페이스= 버튼같은거 -> 리모컨이 버튼을 가질순 있지만 버튼이있다고 전부 리모컨은 아니다
             기능 하나하나를 분리시켜둔거 = 인터페이스 -> 기능끼리 묶어둠
             버튼이라는 인터페이스를 만들면 누른다();는 메서드를 구성하는거
             전원버튼 이라는 class를 만들어서 인플리먼츠 버튼 { 누르다() {라는 메서드를  전원버튼을 켜다 라고 재정의한다
             그럼 이걸 new해서 리모컨에다가도 쓸수있고 모니터에도 쓸수있고
             하지만 리모컨이나 모니터 버튼의 동작 방식이 다를수도있다 그럼 또 전원버튼이라는 클래스는 추상클래스가 되어야한다
             추상화되어있는걸 한번씩 쓰고 버리면 익명클래스 => 또 쓸일이 없으면
             근데 여기서 더 추상화하면 버튼이라는 인터페이스에 누르다라는 하나의 메서드가 있으면 람다식으로
             추상화를 하다보면 메서드를 하나까지 만들수 있다 그럼 람다식으로 만들수있다
             람다식 보면 매개x 리턴x 런어블 만들어진거 쓰면되당 이런 이해도  결국엔 전부다 추상메서드를 가진다ㅏㅏ
             결국 모든 과정은 타고타고타고타고타고 더쉽고 간결하게 만든거다.

             의존성 주입

             스태틱 슽테틱 메ㅗ리는 카피가 안된다new로 만들면 힙메모리에 들어가고 스태틱은 스택메모리에 들어감
            인스턴스 에서add시키면








         */








    }
}
