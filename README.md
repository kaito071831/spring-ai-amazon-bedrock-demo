# spring-ai-amazon-bedrock-demo
## 概要
Spring AI を使って Spring Boot と Amazon Bedrock を繋いてみたアプリケーション

## 記事

## 使用方法
`application.properties`に以下の設定値を記述する
```properties
spring.application.name=spring-ai-amazon-bedrock-demo
spring.ai.bedrock.aws.region={Bedrockを使用するリージョン}
spring.ai.bedrock.aws.timeout=1000m
spring.ai.bedrock.aws.access-key={AWSのアクセスキー}
spring.ai.bedrock.aws.secret-key={AWSのシークレットアクセスキー}
spring.ai.bedrock.titan.chat.enabled=true
```

