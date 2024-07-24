FROM python:3.11

WORKDIR /app

ADD . /app

RUN pip install --no-cache-dir Flask Jinja2 Werkzeug click pip protobuf wheel gRPC

EXPOSE 50051

ENV NAME World

CMD ["python", "app.py"]