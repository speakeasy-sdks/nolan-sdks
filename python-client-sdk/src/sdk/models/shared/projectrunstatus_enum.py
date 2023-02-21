import dataclasses
from enum import Enum

class ProjectRunStatusEnum(str, Enum):
    PENDING = "PENDING"
    RUNNING = "RUNNING"
    ERRORED = "ERRORED"
    COMPLETED = "COMPLETED"
    KILLED = "KILLED"
    UNABLE_TO_ALLOCATE_KERNEL = "UNABLE_TO_ALLOCATE_KERNEL"
