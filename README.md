# dbsgBatch
<br/>

- batch
    - 기본세팅
        - [x]  DB Metadata 생성
        - [ ]  Multi Datasource 설정
        - [ ]  ipo 조회 테스트 → log. 출력.
    - [ ]  일정에 도달하였을 때, 관련 내용을 db comment에 등록
        - ex) 청약이 진행 중입니다!
    - [ ]  종목이 정상적으로 상장한 경우 DB 종료일을 업데이트.
        - 우선은 상장여부 확인이 어려우므로 debut_date를 기준으로 체크하며, 추후에 증권 API를 연동하여 실제 상장여부 확인 진행.
