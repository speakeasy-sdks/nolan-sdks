from __future__ import annotations
import dataclasses
from ..shared import invalidparam as shared_invalidparam
from dataclasses_json import Undefined, dataclass_json
from sdk import utils


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class InvalidParamPayload:
    invalid: list[shared_invalidparam.InvalidParam] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('invalid') }})
    not_found: list[str] = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('notFound') }})
    trace_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('traceId') }})
    