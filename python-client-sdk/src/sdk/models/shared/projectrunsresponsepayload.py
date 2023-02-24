from __future__ import annotations
import dataclasses
from ..shared import projectstatusresponsepayload as shared_projectstatusresponsepayload
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Any


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ProjectRunsResponsePayload:
    next_page: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('nextPage') }})
    previous_page: dict[str, Any] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('previousPage') }})
    runs: list[shared_projectstatusresponsepayload.ProjectStatusResponsePayload] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('runs') }})
    trace_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('traceId') }})
    