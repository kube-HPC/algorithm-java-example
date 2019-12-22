From openjdk:8-jre-slim
ADD ./target/algorithm-example-0.0.1.jar /algorithm/algorithm-example-0.0.1.jar
WORKDIR /algorithm
CMD ["java", "-cp", "algorithm-example-0.0.1.jar", "AlgorithmExample"]