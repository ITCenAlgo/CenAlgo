# 0주차 GIT 과제

## Branch

`git branch` : 로컬 branch 정보를 보여준다.

`git branch -v` : 로컬 branch의 정보를 마지막 커밋 내역과 함께 보여준다.

`git branch -r` : 리모트 저장소의 branch 정보를 보여줌

`git branch -a` : 로컬/ 리모트 저장소의 모든 branch 정보를 보여줌

### branch 생성

```bash
git branch [ branchName ]
git checkout [ branchName ] --해당 브랜치로 이동
git checkout -b [ branchName ] --생성과 동시에 이동
git checkout -b [ branchName ] origin/[branchName] --원격 브랜치 갖고옴
```

### branch 삭제

```bash
git branch -d [ branchName ]
git branch -D [ branchName ] -- 강제 종료
```

## Git 연결

- git add
    - ‘ . ‘ 일 경우 all 이라는 의미
    - 일부 파일만 업데이트 하고 싶을경우 경로 작성하여 업데이트
- git commit -m
    - 해당 관련에 어떠한 일을 했는데 메세지 작성
- git push origin [ branchName ]
    - 해당 branchName에 업로드

## Git 불러오기

- git pull origin [ branchName ]