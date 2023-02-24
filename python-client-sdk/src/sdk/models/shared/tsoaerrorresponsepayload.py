from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class TsoaErrorResponsePayload:
    reason: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('reason') }})
    trace_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('traceId') }})
    details: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.field_name('details'), 'exclude': lambda f: f is None }})
    