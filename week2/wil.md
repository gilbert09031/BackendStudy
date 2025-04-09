백엔드 스터디 2주차 WIL
====================

### 1. 스프링
- 스프링 빈 : 어플리케이션 전역에서 사용할 공용 객체
- 스프링 컨테이너 : 스프링 빈을 저장하는 공간, 빈이 필요할때 컨테이너 에서 받아서 사용한다 / Application Context라고도 한다.
   - 빈을 요구하는 객체 또한 빈이다.-> 빈들이 서로를 사용하는 구조로 이루어져 있다.

### 2. 스프링 빈 저장
- 설정 파일 작성(수동등록) : 자바 클래스로 작성, 클래스에 @Configuration으로 설정파일임을 암시함.
  - main -> bean(package) -> MyBean(Class) : ApplicationContext생성
  - main -> bean(package) -> Config(Class) : 클래스에 @Configuration, 메서드에 @Bean Annotation 포함.
- 빈은 기본적으로 1개의 객체임. 서로 다른 빈에서 같은 빈을 호출하면 동일한 객체를 반환함.
- 컴포넌트 스캔(자동등록) : 별도의 설정파일 없이 빈을 생성할 클래스에 @Componenent Annotation을 사용.
  - Application 실행시 @Component Annotation이 포함된 클래스를 자동으로 빈 등록.

### 3. 스프링 빈 받아오기
- 의존성 : A의 기능을 실행하는데 B의 기능이 필요할때 A는 B에 의존한다고 한다.
- 의존성 주입 : 내가 의존하는 객체를 직접 생성하지 않고 외부에서 주입 받는 것.
  - 스프링에서는 컨테이너 내부의 빈들 사이의 의존성을 프레임워크가 주입한다.
  - OCP(Open Close Principle)을 준수하기 위해서 사용됨. 이미 만들어진 객체를 재사용해 메모리 사용량을 줄이기 위함.
  - 생성자 주입 : 필요한 의존성을 final으로 추가, @RequiredArgsConstructor을 통해 자동으로 생성자 추가, 생성자가 하나라면 @Autowired 생략가능
  - 필드 주입 : 필드에 바로 @Autowired 사용, final은 사용불가 (테스트코드에서 주로 사용됨)

### 4. 스프링 Layered Architecture
- 컨트롤러 : 클라이언트의 요청을 받고 응답을 보내는 계층, DTO(Data Transfer Object)를 사용하여 서비스 계층과 데이터를 주고 받는다.
- 서비스 : 어플리케이션의 비즈니스 로직이 담기는 계층, 레포지토리 계층과 엔티티 또는 DTO를 사용하여 소통한다.
- 레포지토리 : DB와 소통하며 데이터를 조작하는 계층, 서비스 계층이 결정한 로직을 DB에 적용한다.