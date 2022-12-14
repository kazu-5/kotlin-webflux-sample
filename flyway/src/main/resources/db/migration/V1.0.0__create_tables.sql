CREATE TABLE IF NOT EXISTS tasks
(
    TASK_ID UUID NOT NULL,
    NAME VARCHAR(255) NOT NULL,
    CREATED_AT TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    UPDATED_AT TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (TASK_ID)
);