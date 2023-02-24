from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ProjectRunResponsePayload:
    r"""ProjectRunResponsePayload
    Response format returned by the runProject endpoint
    """
    
    project_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('projectId') }})
    project_version: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('projectVersion') }})
    run_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('runId') }})
    run_status_url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('runStatusUrl') }})
    run_url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('runUrl') }})
    trace_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('traceId') }})
    