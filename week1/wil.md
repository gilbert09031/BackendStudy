# 백엔드 스터디 1주차 WIL

1. 웹 : 여러 컴퓨터가 서로 연결되어 정보를 공유하는 공간
- 웹의 일반적인 형태는 클라이언트 - 서버 패러다임 
- 클라이언트는 서버에게 요청을 하고 서버는 요청대로 동작을 수행함
- 클라이언트가 네이버 메인화면을 요청하면 서버는 네이버의 html파일을 전송함.

2. HTTP : 웹에서 사용하는 프로토콜
- 프로토콜 : 네트워크에서 요청과 응답을 보내는 규칙
- 웹에서는 HTTP라는 프로토콜을 사용한다.
- HTTP 요청은 HTTP Method와 URL이 필요하다
- HTTP Method는 데이터를 다루는 방법, URL은 다룰 데이터의 위치를 담는다.
- GET : 조회 / POST : 생성 / PUT : 수정/ PATCH : 수정 /DELETE : 삭제
- URL은 일반적으로 Pathparameter으로 표현한다 - protocol/domain/path
- HTTP Data는 header와 body로 구분된다.
- body에는 통신에 대한 정보, body에는 json형식으로 데이터를 담는다.
- HTTP 응답에는 상태코드가 포함된다.
- 200(OK) / 201(created) / 400(bad request) / 404(not found) / 500(internal server error)

3. 프론트엔드와 백엔드
- 웹의 구성요소들은 매번 변하는데 변할때마다 html을 매번 수정할 수는 없다.
- UI와 컨텐츠를 각각 프론트엔드 백엔드로 분리
- 프론트가 백엔드에 데이터를 요청하고 백엔드는 DB에서 데이터를 가져와 프론트에게 전달한다.

4. API
- Application Programming Interface
- 어플리케이션과 소통하는 방법을 정의한 것
- 백엔드 API : 프론트엔드의 요청에 포함될 내용, 보내는 응답의 형태를 정의한 것
- REST API : REST Architecture를 따르도록 설계된 API
- URl에는 조작할 데이터, HTTP Method에는 데이터에 대한 행위를 담는다.

5. todo api

회원가입 이메일	   POST 	todo/acount/{id}

회원가입 비밀번호 	POST 	todo/acount/{pw}
  
할 일 생성 			POST 	todo/acount/todo/{todo_id}
  
할 일 조회 			GET		todo/acount/todo/{todo_id}

할 일 수정 			PATCH	todo/acount/todo/{todo_id} 

할 일 삭제 			DELETE	todo/acount/todo/{todo_id}

할 일 체크 			POST 	/todo/{todo_id}/check

할 일 체크 해제		POST 	/todo/{todo_id}/check

친구 찾기			GET 		/todo/friends/{member_id}

친구 팔로우		POST 	/todo/friends/{member_id}/follow

친구 언팔로우		GET 		/todo/friends/{member_id}/unfollow

친구 리스트 조회		GET		/todo/friends/{friend_list}

친구 할일 조회 		GET 		/todo/friends/{member_id}/todo/{todo_id}