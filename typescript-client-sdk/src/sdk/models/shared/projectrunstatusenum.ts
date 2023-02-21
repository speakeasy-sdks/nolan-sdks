import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";

export enum ProjectRunStatusEnum {
    Pending = "PENDING",
    Running = "RUNNING",
    Errored = "ERRORED",
    Completed = "COMPLETED",
    Killed = "KILLED",
    UnableToAllocateKernel = "UNABLE_TO_ALLOCATE_KERNEL"
}