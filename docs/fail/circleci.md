# git

## git clone するときssh-addしないといけない
```shell script
ssh-keygen -t rsa -C "mail-address@gmail.com"
# register pub file in github
eval "$(ssh-agent)"
ssh-add ~/.ssh/github_id_rsa
git clone XXXX
```

## プロセス確認
```shell script
ps -ef | grep ssh-agent
```

## プロセス削除
```shell script
pgrep ssh-agent | xargs kill -9
```
## git bash すると ssh-agent を自動で起動
```shell script
vi ~/.bashrc
#ssh-agent
eval `ssh-agent`
ssh-add

```

## deploy

sshで以下必要だった
```shell script
# .ssh配下にauthorized_keysに追加しないといけない
$ cat id_rsa.pub >> authorized_keys
```

