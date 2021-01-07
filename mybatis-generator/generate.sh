cd `dirname $0`

# 自動生成の成果物を削除する。
rm -f -r ../src/gen/java
mkdir ../src/gen/java
rm -f -r ../src/gen/resources
mkdir ../src/gen/resources

# 自動生成する。
java -jar lib/david-mybatis-generator-core-1.0.0.jar -configfile generatorConfig.xml
