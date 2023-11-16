## 개요
- 주제 : 여행 일정 계획 및 타 유저들에게 계획된 일정을 공유하는 웹 페이지
- 개발 목적
  1. 여행자들이 일정을 쉽게 계획하기 위해 다른 유저들의 일정 공유
  2. 다가오는 여행을 대비하기 위한 일정 계획을 쉽게 관리하기 위함

<br/>

## 개발 일정 및 환경
- 일정 : 2023.11.16 (목) ~ 2023.12.31 (일)
- 개발 환경
  - IDE : STS 4.20.1
  - Front-end Language : React
  - Back-end Language : Java 17
  - JDK : jdk-17
  - Framework : Springboot
  - Database : MySQL
  - ORM : JPA
  - DevOps : AWS EC2, S3(이미지 저장 용도 사용) 
     
<br/>

## 주요 기능
- 로그인/회원가입
  - 아이디/비밀번호 검증 후 로그인
  - 아이디 찾기/비밀번호 찾기
  - 로그인 시 쿠키/세션 생성 (1시간 후 소멸 예정)  
  - third party login 기능 (카카오/구글/페이스북) - 시간 남을 경우 진행 예정

- 여행 계획
  - 모든 유저의 공개 허용된 여행 계획 제목 조회
  - 여행 계획 세부 내용 조회
  - 여행 계획 작성/수정/삭제
  - 여행 동행 구하기 게시판 CRUD
  
<br/>

## 참고 사이트
- 트립라인 https://www.tripline.net
- 스투비플래너 http://www.stubbyplanner.com
