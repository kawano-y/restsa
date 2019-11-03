# restsa
REST ful sample


## Docker
### 起動
```shell script
cd <this project>
docker-compose up -d
```
### 停止
docker-compose down

## mysql
```shell script
mysql -uroot -proot -h127.0.0.1
```

## mongo-express
http://0.0.0.0:8081/

## elastic
### kibana
http://localhost:5601

## spring boot 起動
`./gradlew bootRun`

## ssh
ssh -i "~/.ssh/ky-st.pem" ec2-user@ec2-13-231-57-84.ap-northeast-1.compute.amazonaws.com
