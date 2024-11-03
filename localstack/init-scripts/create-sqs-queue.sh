#!/bin/bash
# Script to create an SQS queue

echo "Creating SQS queue..."
awslocal sqs create-queue --queue-name fila-teste --region sa-east-1
echo "SQS queue created successfully."
