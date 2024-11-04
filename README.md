# 로또 기능 명세서

## ✅ 애플리케이션 기능 명세

### 로또 구입 금액 입력받기

- [ ] 사용자에게 로또 구입금액을 입력하라는 메시지를 출력한다
- [ ] 사용자로부터 로또 구입금액을 표현한 문자열을 입력받는다
    - 문자열 앞 혹은 뒤에 공백을 포함해서 입력해도 된다
    - 로또 구입은 천원 단위로만 가능하다
    - 로또 구입은 한 번에 10만원 까지만 가능하다
- [ ] 구매금액만큼의 로또를 로또번호를 랜덤으로 생성하여 발행한다
    - 하나의 로또는 중복되지 않는 1 부터 45 사이의 6개의 정수로 이루어져 있다
- [ ] 구매가 완료된 로또의 수량과 로또 번호를 오름차순으로 정렬하여 출력한다

### 당첨 번호 입력받기

- [ ] 사용자에게 당첨번호를 입력하라는 메시지를 출력한다
- [ ] 사용자로부터 쉼표로 구분된 6개의 숫자를 표현한 당첨 번호 문자열을 입력받는다
    - 구분자로 나뉘는 각각의 문자열은 공백을 포함해서 입력해도 된다

### 보너스 번호 입력받기

- [ ] 사용자에게 보너스 번호를 입력하라는 메시지를 출력한다
    - 보너스 번호는 당첨 번호와 중복되지 않는다
- [ ] 사용자로부터 로또 숫자 범위의 해당하는 숫자를 표현한 문자열을 입력받는다
    - 문자열 앞 뒤에 공백을 포함해서 입력해도 된다

### 당첨 결과와 수익률 계산하기

- [ ] 사용자가 구입한 로또의 당첨 내역을 판단한다
- [ ] 사용자의 구입 금액과 당첨 내역 정보를 가지고 로또 수익률을 계산한다
    - 수익률은 당첨 금액과 구입 금액의 비로 계산한다
- [ ] 로또 중 1-5등에 당첨된 개수를 표현한 당첨 내역을 출력한다
- [ ] 로또 수익률을 소수점 둘째 자리에서 반올림하여 출력한다

### 애플리케이션 실행 결과 예시

```
구입금액을 입력해 주세요.
8000

8개를 구매했습니다.
[8, 21, 23, 41, 42, 43] 
[3, 5, 11, 16, 32, 38] 
[7, 11, 16, 35, 36, 44] 
[1, 8, 11, 31, 41, 42] 
[13, 14, 16, 38, 42, 45] 
[7, 11, 30, 40, 42, 43] 
[2, 13, 22, 32, 38, 45] 
[1, 3, 5, 14, 22, 45]

당첨 번호를 입력해 주세요.
1,2,3,4,5,6

보너스 번호를 입력해 주세요.
7

당첨 통계
---
3개 일치 (5,000원) - 1개
4개 일치 (50,000원) - 0개
5개 일치 (1,500,000원) - 0개
5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
6개 일치 (2,000,000,000원) - 0개
총 수익률은 62.5%입니다.
```

## ⚠️ 예외처리

- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨다
- [ERROR] 로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다

### 로또 구입 금액 입력받기 예외처리

- [ ] 구입 금액이 정수가 아닌 경우
- [ ] 구입 금액이 천원 단위로 나누어 떨어지지 않는 경우
- [ ] 구입 금액이 천원 미만인 경우
- [ ] 구입 금액이 10만원 보다 큰 경우

### 당첨 번호 입력받기 예외처리

- [ ] 당첨 번호가 정수가 아닌 경우
- [ ] 당첨 번호 6개를 입력하지 않은 경우
- [ ] 당첨 번호 중 로또 숫자 범위에 해당하지 않는 숫자가 있는 경우

### 보너스 번호 입력받기 예외처리

- [ ] 보너스 번호가 정수가 아닌 경우
- [ ] 보너스 번호가 로또 숫자 범위에 해당하지 않는 경우

### 당첨 결과와 수익률 계산하기 예외처리

- [ ] 없음

## 💯 테스트 완료 여부

### 기능 테스트

| 구분                | 테스트 항목       | 구현 |   단위 테스트   | 
|-------------------|--------------|:--:|:----------:|
| **로또 구입 금액 입력**   | 입력 메시지 출력    | ✅  | 입출력 테스트 생략 | 
|                   | 구입 금액 입력 받기  | ✅  | 입출력 테스트 생략 |
|                   | 로또 발행        | ✅  |     ✅      |
|                   | 로또 출력        | ✅  |     ✅      |
| **당첨 번호 입력**      | 입력 메시지 출력    | ✅  | 입출력 테스트 생략 |
|                   | 당첨 번호 입력 받기  | ✅  | 입출력 테스트 생략 |  
| **보너스 번호 입력**     | 입력 메시지 출력    | ✅  | 입출력 테스트 생략 |  
|                   | 보너스 번호 입력 받기 | ✅  | 입출력 테스트 생략 |
| **당첨 결과와 수익률 계산** | 당첨 내역 확인     | ✅  |     ✅      |  
|                   | 수익률 계산       | ✅  |     ✅      |  
|                   | 당첨 내역 출력     | ✅  | 입출력 테스트 생략 |  
|                   | 수익률 출력       | ✅  | 입출력 테스트 생략 | 

### 예외 처리 테스트

| 구분            | 예외 상황         | 예외 처리                                                            | 구현 | 테스트 |
|---------------|---------------|------------------------------------------------------------------|:--:|:---:|
| **구입 금액 입력**  | 정수가 아님        | IllegalArgumentException("[ERROR] 구입 금액의 형식이 잘못되었습니다.")          | ✅  |  ✅  |
|               | 천원 단위가 아닌 금액  | IllegalArgumentException("[ERROR] 구입 금액은 천원 단위여야 합니다.")          | ✅  |  ✅  |
|               | 천원 미만인 금액     | IllegalArgumentException("[ERROR] 구입 금액이 천원 미만입니다.")             | ✅  |  ✅  |
|               | 구입 한도 초과      | IllegalArgumentException("[ERROR] 로또 구입은 한 번에 10만원까지만 가능합니다.")   | ✅  |  ✅  |
| **당첨 번호 입력**  | 정수가 아님        | IllegalArgumentException("[ERROR] 당첨 번호의 형식이 잘못되었습니다.")          |    |     |
|               | 입력 번호가 6개가 아님 | IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.")             |    |     |
|               | 입력 범위가 아닌 숫자  | IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 정수여야 합니다.")  |    |     |
| **보너스 번호 입력** | 정수가 아님        | IllegalArgumentException("[ERROR] 보너스 번호의 형식이 잘못되었습니다.")         |    |     |
|               | 입력 범위가 아닌 숫자  | IllegalArgumentException("[ERROR] 보너스 번호는 1부터 45 사이의 정수여야 합니다.") |    |     |







